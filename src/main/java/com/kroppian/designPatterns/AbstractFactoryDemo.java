/*
 * Interfaces -- Factory
 */
 
abstract class QuoteFactory {

  abstract Author createAuthor(String first, String last, int year, int month, int day);

  abstract Quote createQuote(String first);

}

/*
 * Interfaces -- Products
 */
abstract class Author {

  public Author(String first, String last, int year, int month, int day){
    this.firstName = first; 
    this.lastName = last;
    this.yearOfBirth = year;
    this.monthOfBirth = month;
    this.dayOfBirth = day;

  }

  public String firstName;

  public String lastName;

  public int yearOfBirth;

  public int monthOfBirth;

  public int dayOfBirth;

  abstract public void printName();

  abstract public void printDateOfBirth();

}

abstract class Quote {

  public String quote;

  public Quote(String newQuote){
    this.quote = newQuote; 
  }

  abstract void printQuote();

}


/*
 * Implementations -- Products
 */

class ProperAuthor extends Author {

  public ProperAuthor(String first, String last, int year, int month, int day){
    super(first, last, year, month, day);
  }

  public void printName(){
    System.out.println(this.firstName + " " + this.lastName);
  }

  public void printDateOfBirth(){
    System.out.println(this.yearOfBirth + "/" + this.monthOfBirth + "/" + this.dayOfBirth);
  }

}

class ProperQuote extends Quote {
  
  public ProperQuote(String quote){
     super(quote); 
  }

  public void printQuote(){
  
    System.out.println("~" + this.quote + "~"); 
  
  }


}




class ExcitingAuthor extends Author {
  
  public ExcitingAuthor(String first, String last, int year, int month, int day){
    super(first, last, year, month, day);
  }
  public void printName(){
    System.out.println(this.firstName + " " + this.lastName);
  }

  public void printDateOfBirth(){
    System.out.println(this.yearOfBirth + "/" + this.monthOfBirth + "/" + this.dayOfBirth);
  }


}

class ExcitingQuote extends Quote{

  public ExcitingQuote(String quote){
     super(quote); 
  }

  public void printQuote(){
  
    System.out.println("~" + this.quote + "~"); 
  
  }

}

/*
 * Implementations -- Factories
 */

class ProperQuoteFactory extends QuoteFactory{

  Author createAuthor(String first, String last, int year, int month, int day){
    return new ProperAuthor(first, last, year, month, day); 
  }

  Quote createQuote(String quote){
    return new ProperQuote(quote); 
  }

}

class ExcitingQuoteFactory extends QuoteFactory {

  Author createAuthor(String first, String last, int year, int month, int day){
    return new ExcitingAuthor(first, last, year, month, day); 
  }

  Quote createQuote(String quote){
    return new ExcitingQuote(quote); 
  }

}







/*
 * Main
 */
class AbstractFactoryDemo {

  public static void main(String[] args){

  }

}


