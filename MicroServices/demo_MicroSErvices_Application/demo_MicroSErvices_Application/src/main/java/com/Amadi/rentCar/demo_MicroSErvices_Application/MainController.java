package com.Amadi.rentCar.demo_MicroSErvices_Application;

import com.Amadi.rentCar.demo_MicroSErvices_Application.model.Student;
import com.Amadi.rentCar.demo_MicroSErvices_Application.servicer.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    //this java method will call from service.That means it is a HTTP
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    //@RequstMapping -it map the request into java method.when having url "/hello",it map to this method.
    public String Greeting(){
        return "Hello springBoot from GET";
    }
//we can change the method of requst mapping .Then it knows which rest method match with java method
    @RequestMapping(value ="/hello", method = RequestMethod.POST)
    public String Greeting2(){
        return "Hello springBoot from POST";
    }

    //create end point to deal with database
    @RequestMapping(value ="/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    //in the controller,you have student endpoint,then pass the student object.student object go to service.in the service we use service annotataion to anootate service.
    //and it will create a bean.from there you can manage reposity


    //find data from database
    @RequestMapping(value ="/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if(student== null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(student);
        }
    }
}
