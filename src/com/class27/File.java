package com.class27;

/*Create a class File that will have the following behaviors:
 *  open, edit, close. Edit and close are implemented method 
 *  while open is an abstract. Create 3 subclasses: JavaFile,
 *   WordFile, PDFFile that will provide specific implementation
 *    of open behaviour: Exmaple: to open .java file we need notepad++ or sublime tex, 
 *    to open .doc file we need Microsoft word to be installed
 */

public abstract class File {
	public abstract void open ();
	
	public void edit () {
		System.out.println("To edit file, press Edit button on Main menu");
	}
	
	public void close () {
		System.out.println("To close file, click on File button, and choose Close option");
	}
}	
	class JavaFile extends File {

		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("To open .java file we need notepad++ or sublime text to be installed");
		}
		
	}
	 class WordFile extends File {

		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("To open .doc file we need Microsoft word to be installed");
		}
		
	}
	class PDFFile extends File {

		@Override
		public void open() {
			// TODO Auto-generated method stub
			System.out.println("To open .pdf file we need Adobe Acrobat Reader to be installed");
		}
		
	}
	 class TestFile {
		public static void main(String[] args) {
			File obj=new JavaFile ();
			File obj1=new WordFile ();
			File obj2=new PDFFile();
			
			obj.open(); obj.edit(); obj.close();
			System.out.println();
			obj1.open(); obj1.edit(); obj1.close();
			System.out.println();
			obj2.open(); obj2.edit(); obj2.close();
			
		}
		}

