package epamcom.CollectionFramework;
import java.util.*;
public class ListOperations {
    public static void main(String[] args) 
    {
        CustomList<Integer> list = new CustomList<Integer>();
        boolean b = true;
        Scanner sc =  new Scanner(System.in);
        while(b) {
        	System.out.println("Select your operation from 1 to 4");
        	System.out.println("Click 1 To add element to list");
        	System.out.println("Click 2 To remove element from list");
        	System.out.println("Click 3 To get the size Of List");
        	System.out.println("Click 4  To Access element with index");
        	System.out.println("Click 5 To Print the list");
        	int opt = sc.nextInt();
        	switch(opt) {
        	case 1 : 
        		System.out.println("Enter number to be added into the list");
        		list.addElement(sc.nextInt());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		//System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	case 2 : 
        		System.out.println("Enter number to be deleted from the list");
        		list.removeElement(sc.nextInt());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		//System.out.println("Thank you for using my List!!");
        		b = true;
        		break;
        	} else {
        		b = false;
        		break;
        	}
        	case 3 : System.out.println("The size of list is "+list.size());
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		//System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}	
        	case 4 :
        		System.out.println("Enter index : Indexing starts from 0");
        		System.out.println("The element is "+list.getElement(sc.nextInt()));
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		//System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	case 5 : System.out.println("The list is "+list);
        	System.out.println("Do you want to continue?");
        	if(sc.next().charAt(0) == 'y') {
        		b = true;
        		break;
        	} else {
        		//System.out.println("Thank you for using my List!!");
        		b = false;
        		break;
        	}
        	}
        }
    }
}
