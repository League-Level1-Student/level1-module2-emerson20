
public class Tea_Party {
public String welcome(String name, boolean isWoman, boolean isKnighted) {
    String h =  "Hello";
    
    if (isWoman) {
		return h+ " Ms. " + name;
	}else if (isWoman == false && isKnighted == false) {
		return h+ " Mr. " + name;
	}else if (isWoman == false && isKnighted) {
		 return h+ " Sir " + name;
	}return null;
//    if (isKnighted == false && isWoman) {
//		System.out.println("Hello Ms. Austen");
//	}else if (isKnighted && isWoman == false) {
//		System.out.println("Hello Mr. Orwell");
//	}else {
//		System.out.println("Hello Sir Isaac Newton");
//	}
    }
}
                                                                                                   