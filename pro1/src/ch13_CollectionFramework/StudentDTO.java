package ch13_CollectionFramework;

import java.util.Date;

//DAO(Data Access   Object): DB에 접근용도의 클래스
/*DTO(Data Transfer Object): Data를 전송역할하는 클래스
                             읽기getter. 설정setter */
/*VO(Value Object) : Value을 보관. 읽기전용getter 
                     불변의 특징. 
                     hashCode()오버라이딩, equals()오버라이딩   */

public class StudentDTO {
	//field [접제] [modifier] 타입 필드명[=초기값]
	private String stuNo;  //학번 "0012345"  
	private String stuName;//학생명  "홍길동"
	private Date enrollmentDate;//입학일
	
	//constructor [접제] 클래스명(){}
	public StudentDTO() {}
	public StudentDTO(String stuNo,String stuName,Date enrollmentDate){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.enrollmentDate = enrollmentDate;
	}
	
	//method [접제] [modifier] 리턴타입 메서드명(파라미터리스트){}
	//getter
	public  Date getEnrollmentDate(){
		return this.enrollmentDate;
	}
	public  String getStuName(){
		return this.stuName;
	}
	public  String getStuNo(){
		return this.stuNo;
	}
	//setter
	public  void setStuNo(String stuNo){
		this.stuNo = stuNo;
	}
	public  void setStuName(String stuName){
		this.stuName = stuName;
	}
	public  void setEnrollmentDate(Date enrollmentDate){
		this.enrollmentDate = enrollmentDate;
	}
	
}

