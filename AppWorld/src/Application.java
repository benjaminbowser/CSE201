
public class Application {
	
	//Forum forum; Forum not implemented yet
	double price, rating;
	String title, companyName, releaseDate, description,category;
	boolean approved;
	//Constructor
	
	//Automatically sets the approved field to false
	public Application(double price, String title, String companyName, String releaseDate,
			String description, String category) {
		this.price = price;
		this.rating = rating;
		this.title = title;
		this.companyName = companyName;
		this.releaseDate = releaseDate;
		this.description = description;
		this.category = category;
		//rating = calculateRating();
		approved = false;
	}
	
	void approve(){
		this.approved = true;
	}
	
	//TODO:
	//Add a comment on an application's page
	//public void addComment(Comment submittedComment)
	
	//Calculate the rating of an app based off it's comments in the forum
	//public void calculateRating()
	//Loops through each comment with a rating in the applications forum adding all
	//ratings together and then divide by total number of comments
	
	//Getters and Setters
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
