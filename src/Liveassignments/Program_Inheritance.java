package liveassignments;

public class Program_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookRating bookRating = new BookRating();
		bookRating.userId = 101;
		bookRating.feedback = "Such a lovely session";
		bookRating.doYouLike = true;
		
		System.out.println(bookRating.userId+ " : "+bookRating.feedback + " : " + bookRating.doYouLike );

	}

}
