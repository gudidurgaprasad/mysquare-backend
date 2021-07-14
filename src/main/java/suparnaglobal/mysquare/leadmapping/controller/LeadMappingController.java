/**
 * 
 */
package suparnaglobal.mysquare.leadmapping.controller;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import suparnaglobal.mysquare.leadmapping.entity.LeadMappingEntity;
import suparnaglobal.mysquare.leadmapping.entity.LeadTypeEntity;
import suparnaglobal.mysquare.leadmapping.entity.ProjectEntity;
import suparnaglobal.mysquare.leadmapping.entity.RoleEntity;
import suparnaglobal.mysquare.leadmapping.entity.UserEntity;
import suparnaglobal.mysquare.leadmapping.model.LeadMapping;
import suparnaglobal.mysquare.leadmapping.model.Project;
import suparnaglobal.mysquare.leadmapping.model.User;
import suparnaglobal.mysquare.leadmapping.repository.LeadMappingRepository;
import suparnaglobal.mysquare.leadmapping.repository.LeadTypeRepository;
import suparnaglobal.mysquare.leadmapping.repository.ProjectRepository;
import suparnaglobal.mysquare.leadmapping.repository.RoleRepository;
import suparnaglobal.mysquare.leadmapping.repository.UserRepository;


/**
 * @author dnvsr
 *
 */
@RestController
@RequestMapping("/controller")
public class LeadMappingController {
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	LeadTypeRepository leadTypeRepository;

	@Autowired
	LeadMappingRepository leadMappingRepository;
	
	@PostMapping("/uploadUser")
	public List<LeadMapping> importExcelFile(@RequestParam("file") MultipartFile files) throws IOException {

		List<LeadMapping> leadMappings = new ArrayList<>();

		XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());

		XSSFSheet worksheet = workbook.getSheetAt(0);
		for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
			if (index > 0) {
				XSSFRow row = worksheet.getRow(index);
				LeadMapping leadMapping = new LeadMapping();
				
//				leadMapping.project_id = 1;
//				leadMapping.sales_user_id = 1;
//				leadMapping.lead_id = 1;
				leadMapping.location = getCellValue(row, 5);
				leadMapping.profile = getCellValue(row, 6);
				leadMapping.requirements = getCellValue(row, 7);
				leadMapping.budget = getCellValue(row, 8);
				leadMapping.user_payment_response = getCellValue(row, 9);
				leadMapping.lead_profile = getCellValue(row, 10);
				leadMapping.lead_score = getCellValue(row, 11);
				leadMapping.site_visit = getCellValue(row, 12);
				leadMapping.feedback1 = getCellValue(row, 13);
				leadMapping.feedback2 = getCellValue(row, 14);
				leadMapping.feedback3 = getCellValue(row, 15);
				leadMapping.followed_by = getCellValue(row, 16);
//				leadMapping.follow_up_date = getCellValue(row, 17);
				leadMapping.booking = getCellValue(row, 18);
				leadMapping.assigned_to = getCellValue(row, 19);
//                user.age = convertStringToInt(getCellValue(row, 3));
//                user.address = getCellValue(row, 4);

				leadMappings.add(leadMapping);
			}
		}
		/*
		// Save to db.
        List<StudentEntity> entities = new ArrayList<>();
        if (students.size() > 0) {
            students.forEach(x->{
                StudentEntity entity = new StudentEntity();
                entity.student_no = x.studentNo;
                entity.first_name = x.firstName;
                entity.last_name = x.lastName;
                entity.age = x.age;
                entity.address = x.address;

                entities.add(entity);
            });

            studentRepository.saveAll(entities);
        }
		*/
		List<LeadMappingEntity> entities = new ArrayList<>();
        if (leadMappings.size() > 0) {
        	leadMappings.forEach(x->{
                LeadMappingEntity entity = new LeadMappingEntity();
                entity.project_id = x.project_id;
                entity.sales_user_id = x.sales_user_id;
                entity.lead_id = x.lead_id;
                entity.location = x.location;
				entity.profile = x.profile;
				entity.requirements = x.requirements;
				entity.budget = x.budget;
				entity.user_payment_response = x.user_payment_response;
				entity.lead_profile = x.lead_profile;
				entity.lead_score = x.lead_score;
				entity.site_visit = x.site_visit;
				entity.feedback1 = x.feedback1;
				entity.feedback2 = x.feedback2;
				entity.feedback3 = x.feedback3;
				entity.followed_by = x.followed_by;
//				leadMapping.follow_up_date = getCellValue(row, 17);
				entity.booking = x.booking;
				entity.assigned_to = x.assigned_to;

                entities.add(entity);
            });

            leadMappingRepository.saveAll(entities);
        }

		
		return leadMappings;
	}
	
	private String getCellValue(Row row, int cellNo) {
		DataFormatter formatter = new DataFormatter();

		Cell cell = row.getCell(cellNo);

		return formatter.formatCellValue(cell);
	}
	
	@GetMapping("/get-user")
	public List<UserEntity> getUsers() {
		List<UserEntity> result = new ArrayList<>();

		List<UserEntity> entities = userRepository.findAll();

		if (entities != null && entities.size() > 0) {
			entities.forEach(x -> {
				UserEntity item = new UserEntity();
				item.first_name = x.first_name;
				item.last_name = x.last_name;
				item.email = x.email;

				result.add(item);
			});
		}

		return result;
	}
/*	
	
	@GetMapping("/get-leads")
	public List<User> getLeads() {
		List<User> result = new ArrayList<>();

		List<UserEntity> entities = userRepository.getLeads();

		if (entities != null && entities.size() > 0) {
			entities.forEach(x -> {
				User item = new User();
				item.first_name = x.first_name;
				item.last_name = x.last_name;
				item.email = x.email;

				result.add(item);
			});
		}

		return result;
	}
*/	
	@GetMapping("/get-role")
	public List<RoleEntity> getRoles() {
		List<RoleEntity> result = new ArrayList<>();

		List<RoleEntity> entities = roleRepository.findAll();

		if (entities != null && entities.size() > 0) {
			entities.forEach(x -> {
				RoleEntity item = new RoleEntity();
				item.role_id = x.role_id;
				item.role_name = x.role_name;

				result.add(item);
			});
		}

		return result;
	}
	
	@GetMapping("/get-project")
	public List<Project> getProjects() {
		List<Project> result = new ArrayList<>();

		List<ProjectEntity> entities = projectRepository.findAll();

		if (entities != null && entities.size() > 0) {
			entities.forEach(x -> {
				Project item = new Project();
				item.project_id = x.project_id;
				item.project_name = x.project_name;
				item.project_desc = x.project_desc;

				result.add(item);
			});
		}

		return result;
	}

	@GetMapping("/get-lead-type")
	public List<LeadTypeEntity> getLeadType() {
		List<LeadTypeEntity> result = new ArrayList<>();

		List<LeadTypeEntity> entities = leadTypeRepository.findAll();

		if (entities != null && entities.size() > 0) {
			entities.forEach(x -> {
				LeadTypeEntity item = new LeadTypeEntity();
				item.lead_type_id = x.lead_type_id;
				item.lead_type_name = x.lead_type_name;
				item.lead_score = x.lead_score;

				result.add(item);
			});
		}

		return result;
	}
	
/*
	
	@PostMapping("/create-role")
    public ResponseEntity<RoleEntity> create(@RequestBody @Valid RoleEntity roleEntity) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(roleEntity.userEntity.getUser_id());
        if (!optionalUserEntity.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        roleEntity.setUserEntity(optionalUserEntity.get());

        RoleEntity savedRoleEntity = roleRepository.save(roleEntity);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(savedRoleEntity.getRole_id()).toUri();

        return ResponseEntity.created(location).body(savedRoleEntity);
    }
*/	
	@PostMapping("/create-user")
    public ResponseEntity<UserEntity> create(@Valid @RequestBody UserEntity userEntity) {
		Date date = new Date();
		userEntity.setCreated_date(date);
		
		UserEntity userSavedEntity  = userRepository.save(userEntity);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(userSavedEntity.getUser_id()).toUri();

        return ResponseEntity.created(location).body(userSavedEntity);
    }
	
	/*
	
	@PostMapping("/create-role")
	public RoleEntity<RoleEntity> create(@Valid @RequestBody RoleEntity roleEntity) {
		UserEntity userSavedEntity  = roleRepository.save(roleEntity);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
            .buildAndExpand(userSavedEntity.getUser_id()).toUri();

        return ResponseEntity.created(location).body(userSavedEntity);
    }
    */

}
