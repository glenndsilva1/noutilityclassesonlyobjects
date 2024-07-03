package com.servlet;

public interface Name {
	public String name();
	
	class FirstName implements Name {
		private Name origin;
		FirstName(Name name){
			this.origin = name; 
		}
		@Override
		public String name() {
			String name[] = this.origin.name().split(",");
			return name[0];
		}
	}
	
	class SecondName implements Name {
		private Name origin;
		SecondName(Name name){
			this.origin = name; 
		}
		@Override
		public String name() {
			String name[] = this.origin.name().split(",");
			return name[1];
		}
	}

	public static void main(String args[]) {
		Name fname = new FullName("Glenn,Dsilva");
		Name.FirstName firstname = new Name.FirstName(fname);
		System.out.println(firstname.name());
		Name.SecondName secondname = new Name.SecondName(fname);
		System.out.println(secondname.name());
	}
}
