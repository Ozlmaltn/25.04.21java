package odevders2;

import odevders2.start;


public class start {

	public static void main(String[ ] args) {
		 
		Lesson lesson = new Lesson  ( 1,"C#" , "Engin Demirog"  );
		Lesson lesson2 = new Lesson ( 2,"Java" , "Engin Demirog" );
		
		Lesson[  ] lessons =  {lesson,lesson2};
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.addToCart(lesson );
		
		LessonManager lessonManager2 = new LessonManager();
		lessonManager2.addToCart(lesson2 );
		
		System.out.println(lessons.length  );

	}

}
