//package com.wtt.admin.adminController;
//
//import java.io.IOException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//
//import com.wtt.admin.adminEntity.SolarRegEntity;
//import com.wtt.admin.adminService.SolarRegService;
//@RestController
//@RequestMapping("/api")
//public class SolarRegController {
//	 @Autowired
//	    private SolarRegService userService;
//
//	    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//	    public ResponseEntity<SolarRegEntity> saveUser(
//	            @RequestParam("name") String name,
//	            @RequestParam("address") String address,
//	            @RequestParam("mobileNumber") Long mobileNumber,
//	            @RequestParam("solarCapacity") Long solarCapacity,
//	            @RequestParam("paymentMode") String paymentMode,
//	            @RequestParam("aadharCardFile") MultipartFile aadharFile,
//	            @RequestParam("panCardFile") MultipartFile panFile,
//	            @RequestParam("bankDetailsFile") MultipartFile bankFile
//	    ) {
//	        try {
//	            SolarRegEntity user = new SolarRegEntity(
//	                    name,
//	                    address,
//	                    mobileNumber,
//	                    solarCapacity,
//	                    paymentMode,
//	                    aadharFile.getBytes(),
//	                    panFile.getBytes(),
//	                    bankFile.getBytes()
//	            );
//
//	            SolarRegEntity saved = userService.saveUser(user);
//	            return new ResponseEntity<>(saved, HttpStatus.CREATED);
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	        }
//	    }
//
//	 /*   @GetMapping("/{id}")
//	    public ResponseEntity<Optional<User>> getUser(@PathVariable Long id) {
//	        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
//	    }*/
//	    
//
////	    @GetMapping
////	    public ResponseEntity<List<Map<String, Object>>> getAllUsers() {
////	        return new ResponseEntity<>(userService.getAllUsersWithImages(), HttpStatus.OK);
////	    }
//	    
//	    @GetMapping()
//	    public ResponseEntity<List<SolarRegEntity>> getAllUsers() {
//	        return new ResponseEntity<>(SolarRegService.getAllUsersWithImages(), HttpStatus.OK);
//	    }
//
//	    
//	 
//	 /*   @GetMapping("/{id}")
//	    public ResponseEntity<byte[]> downloadUserFile(@PathVariable Long id,@PathVariable String fileType){
//	    	Optional<User> userOptional = userService.getUser(id);
//	    	if(userOptional.isPresent()) {
//	    		User user = userOptional.get();
//	    		byte[] fileData = new byte[0];
//	    		String fileName="";
//	    		switch(fileType.toLowerCase()) {
//	    		case "adhar":
//	    			fileData =user.getAadharCardFile();
//	    			fileName = "adhar.pdf";
//	    		break;
//	    		case "pan":
//	    			fileData = user.getPanCardFile();
//	    			fileName = "pan.pdf";
//	    			break;
//	    			
//	    		 case  "bank":
//	    			fileData = user.getBankDetailsFile();
//	    			fileName = "bank.pdf";
//	    	
//	    		}
//	    	return ResponseEntity.ok()
//	    			 .header("Content-Disposition", "attachment; filename=" + fileName)
//	                 .header("Content-Type", "application/pdf")
//	                 .body(fileData);
//	    	
//	}else {
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//				
//	}
//	}*/
//	   
//
//	   
//}
