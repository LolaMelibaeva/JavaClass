package com.class23;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("--Creating ScrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, Burndown Chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Daily Standups, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating Developer object ---");
		Developer dev=new Developer ();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint Planning, Daily Standups, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object ---");
		Tester qa=new Tester();
		Tester.work();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint grooming, Sprint Planning, Daily Standups, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		System.out.println("---Creating Business Analyst object ---");
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=75000;
		ba.getPaid();
		ba.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		ba.ceremonies="Sprint grooming, Sprint Planning, Daily Standups, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		
		System.out.println("---Creating Produc Owner object ---");
		ProductOwner po=new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		po.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		
		System.out.println("----Creating FrontEnd Developer-----");
		FrontEnd fdev=new FrontEnd();
		FrontEnd.work();
		fdev.salary=200000;
		fdev.getPaid();
		fdev.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		fdev.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro";
		fdev.workOnArtifacts();
		fdev.attendScrumMeetings();
		fdev.code();
		fdev.doHtml();
		
		
		System.out.println("----Creating BackEnd Developer-----");
		BackEnd bdev=new BackEnd();
		BackEnd.work();
		bdev.salary=200000;
		bdev.getPaid();
		bdev.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		bdev.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro";
		bdev.workOnArtifacts();
		bdev.attendScrumMeetings();
		bdev.code();
		bdev.doSql();
		
		
		System.out.println("----Creating Manual Tester-----");
		ManualTester mtest=new ManualTester();
		ManualTester.work();
		mtest.salary=60000;
		mtest.getPaid();
		mtest.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		mtest.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro";
		mtest.workOnArtifacts();
		mtest.attendScrumMeetings();
		mtest.test();
		mtest.testManually();
		
		System.out.println("----Creating Automation Tester-----");
		AutomationTester atest=new AutomationTester();
		AutomationTester.work();
		atest.salary=90000;
		atest.getPaid();
		atest.artifacts="Sprint backlog,Sprint Backlog, Burndown Chart";
		atest.ceremonies="Sprint grooming, Sprint Planning, Sprint Demo, Sprint Retro";
		atest.workOnArtifacts();
		atest.attendScrumMeetings();
		atest.test();
		atest.codeInJava();
		

		
		
		
		
		
		
		

		
		
	}

}
