package beans;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import sorters.AgeAcd;
import sorters.AgeDesc;
import sorters.GradeAcd;
import sorters.GradeDesc;
import sorters.NameDesc;

/**
 * Servlet implementation class Server
 */
@WebServlet("/Server")
public class Server extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static ArrayList<Student> students = new StudentArray().studentList;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Server() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		students=new StudentArray().studentList;

		int minAge = Integer.parseInt(request.getParameter("minAge"));
		int maxAge = Integer.parseInt(request.getParameter("maxAge"));
		int minGrade = Integer.parseInt(request.getParameter("minGrade"));		
		int maxGrade = Integer.parseInt(request.getParameter("maxGrade"));
		String sort = request.getParameter("sortBy");
		
 		
 		students=StudentArray.minAge(minAge, students);
 		students=StudentArray.maxAge(maxAge, students);
 		students=StudentArray.minGrade(minGrade, students);
 		students=StudentArray.maxGrade(maxGrade, students);
 		
 		
 		switch (sort) {
 		case "nameAcd": Collections.sort(students); break;
 		case "nameDesc": Collections.sort(students, new NameDesc()); break;
 		case "ageAcd": Collections.sort(students, new AgeAcd());  break;
 		case "ageDesc": Collections.sort(students, new AgeDesc());  break;
 		case "gradeAcd": Collections.sort(students, new GradeAcd());  break;
 		case "gradeDesc": Collections.sort(students, new GradeDesc());  break;
 		default : Collections.sort(students); break;
 		}
	
		JSONArray jsoa = new JSONArray();
 		for (Student s : students) {
			JSONObject jsob = new JSONObject();
			jsob.put("Name:", s.getName());
			jsob.put("Age:", s.getAge());
			jsob.put("Grade:", s.getGrade());
			jsoa.add(jsob);
		}
 		
// 		print list
		for (Student s : students) {
			response.getWriter().append(s.toString()+"\n");
		}
		
// 		print json array
			response.getWriter().append(jsoa.toString()+"\n");
			
	}
}
	

