/*
 * Title: Simple Interest class
 * Description: ''.
 * Author: Forhad Hossain ( callbackMind )
 * Date: 12/11/23 
*/
public class SimpleInterest {


double principleAmount;
double timePeriod;
double interestRate;


void setValues(double pa, double tp, double ir) {
this.principleAmount=pa;
this.timePeriod=tp;
this.interestRate=ir;	
}


double getInterestAmount() {
	
double ans = (principleAmount*timePeriod*interestRate)/100;
ans =Math.round(ans*100.0)/100.0;
return ans;
	
}

}







