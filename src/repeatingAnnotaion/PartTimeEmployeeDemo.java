package repeatingAnnotaion;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;


/**
 * 
 * @author HEMANTH
 * ProblemStatement:
TechSol wants to maintain a change history for the methods of PartTimeEmployee class.
The change in history includes the following:

name of the developer who modifies the method

during when (date and time) the method gets modified

reason for modifying the method

Find a solution to maintain these details at the code level.
 *
 */

@Repeatable(value = ChangeHistorys.class)
@Retention(RetentionPolicy.RUNTIME)
@interface ChangeHistory {
String developerName();
String updatedDateTime();
String reasonOfModifiyng();
}

@Retention(RetentionPolicy.RUNTIME)
@interface ChangeHistorys{
ChangeHistory[] value();
}

@ChangeHistory(developerName = "Suvankar Sen", reasonOfModifiyng = "myMethod Return Hello", updatedDateTime = "13/4/1990")
@ChangeHistory(developerName = "Avijit Roy", reasonOfModifiyng = "myMethodAppend 4 with return value", updatedDateTime = "13/4/1999")
public class PartTimeEmployeeDemo {
public String myMethod(){
return "Hello";
}

public String myMethodAppend(){
return "Hello4";
}

public static void main(String[] args) {
ChangeHistory[] changeHistoryArray = PartTimeEmployeeDemo.class.getAnnotationsByType(ChangeHistory.class);
for(ChangeHistory changeHistory : changeHistoryArray){
System.out.println(changeHistory.developerName()+"->"+changeHistory.reasonOfModifiyng()+"->"+changeHistory.updatedDateTime());
}
}
}

