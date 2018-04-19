	package java_core;
	
	public class VariableTest {
		//instance variables
				int id;
				int age;
				String name;
			static String college;//static variable
				/*
				 * 3 types of variables
				 * 1. instance variables
				 * 2. local variables
				 * 3. static variables(class variables)
				 * 4. reference variables
				 * 
				 * */
				
		
		public static void main(String[] args) {
			
			int p,w,r,s,k; //local variables
			
			VariableTest vt;//reference variables
			vt=new VariableTest();
			vt.id=222;
			
				//VariableTest vr= new VariableTest();
			//	vr.id=111;
			
			
		}
		void print(){
			id=222;
		}
	
	}
