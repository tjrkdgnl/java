
@SuppressWarnings("unused")
public class Subject {
	
		public String className ;
		private String professor;
		private String roomNumber;
		
		
		public Subject(String className,String professor,String roomNumber) {
			this.className = className;
			this.professor = professor;
			this.roomNumber = roomNumber;
			
		}
		
		public Subject(String className) {
			this.className = className;
			
		}
		public Subject(Subject subject) {
			subject.className = this.className;
			subject.professor = this.professor;
			subject.roomNumber = this.roomNumber;
		}
		
		public String  GetName() {		
			return this.className;
		}
		
		public String GetProfessor() {
			return this.professor;
		}
		
		public String GetRoom() {
			return this.roomNumber;
		}
		
		public void SetProfessor(String Professor) {
			this.professor = Professor;
		}
		
		public void SetRoom(String room)
		{
			this.roomNumber = room;
		}
		
		public boolean equals(Subject sub) {
			
			if(this.className  == sub.className && this.professor == sub.professor && this.roomNumber == sub.roomNumber) {
				return true;
			}
			else
				return false;
		}
		
		public String toString() {
			return this.className;
		}
		
		public void GetDetails() {	
			
			System.out.println("Name : " + this.className);
			System.out.println("TuTor : " + this.professor);
			System.out.println("Room : " + this.roomNumber);
		}
	
	}


