package com.upskill.java_6;

	public class Singelton {
	
	private Singelton(){
	
}
	private static Singelton sigletonobj = new Singelton();
	
	public static Singelton getInstance(){
		return sigletonobj;
	}
	
	protected static void demoLvl(int lvl){
		System.out.println("Singleton pokemon demo,s age ->" + lvl);
	}
	protected static void demoType(String Type){
		System.out.println("Singleton demo is a ->" + Type + " type");
	}
	protected static void demoIsCool(Boolean canRgenerate){
		System.out.println("Singleton demo pokemon is cool :]" + canRgenerate);
	}


	 
	//change for git pull request practice 
	protected static void demoSkill(String Skill){
	System.out.println("Singleton demo pokemon is cool :]" + Skill);

	}
	}