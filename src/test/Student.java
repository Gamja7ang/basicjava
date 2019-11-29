package map.test;


public class Student{
	private String  studentId;
	private String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	@Override
	public String toString() {
		return studentId + " : " + studentName;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentId); 
		//return값에 정수 값을 입력 시 정렬, 중복 제거 됨. hash table을 확인해봐야함,2^32까지 이론상 가능
		//Integer.parseInt() : 중복제거, 정렬은 안됨
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentId == student.studentId)
				return true;
			else
				return false;
				}
		return false;
	}
	
}
