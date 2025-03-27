import java.util.Scanner;

class Question6 {

    // Method to convert a number less than 100 into words
    String convert(int num) {
        String word = "";
        switch (num) {
            case 0: word = "zero"; break;
            case 1: word = "one"; break;
            case 2: word = "two"; break;
            case 3: word = "three"; break;
            case 4: word = "four"; break;
            case 5: word = "five"; break;
            case 6: word = "six"; break;
            case 7: word = "seven"; break;
            case 8: word = "eight"; break;
            case 9: word = "nine"; break;
            case 10: word = "ten"; break;
            case 11: word = "eleven"; break;
            case 12: word = "twelve"; break;
            case 13: word = "thirteen"; break;
            case 14: word = "fourteen"; break;
            case 15: word = "fifteen"; break;
            case 16: word = "sixteen"; break;
            case 17: word = "seventeen"; break;
            case 18: word = "eighteen"; break;
            case 19: word = "nineteen"; break;
            case 20: word = "twenty"; break;
            case 30: word = "thirty"; break;
            case 40: word = "forty"; break;
            case 50: word = "fifty"; break;
            case 60: word = "sixty"; break;
            case 70: word = "seventy"; break;
            case 80: word = "eighty"; break;
            case 90: word = "ninety"; break;
            default:
                if (num > 20 && num < 100) {
                    word = convert((num / 10) * 10) + " " + convert(num % 10);
                }
        }
        return word;
    }

   
    String bigVal(int index) {
        String word = "";
        switch (index) {
            case 1: word = ""; break;
            case 2: word = "hundred"; break;
            case 3: word = "thousand"; break;
            case 4: word = "million"; break; 
            case 5: word = "billion"; break;  
        return word;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt(); 
        Question6 q = new Question6();  
        int count = 0; 
        int num = n;
        
        while (num > 0) {
            num = num / 10;
            count++;
        }

        num = n;  
        String ans = "";  
        int x = 1; 
        int cnt = count;  

       
        while (count > 0) {
            int lastdigit = n % 10;  
            String temp = "";

            if (x == 1) { 
                temp = q.convert(lastdigit);  
                ans = temp + " " + ans;
                n = n / 10; 
                x++;
            }
            else if (x == 2) { 
                if (lastdigit != 0) {
                    int number = lastdigit * 10 + (n % 10);
                    temp = q.convert(number); 
                    ans = temp + " " + ans;
                }
                n = n / 10;
                x++;
            }
            else if (x == 3) { 
                temp = q.convert(lastdigit) + " hundred"; 
                ans = temp + " " + ans;
                n = n / 10;
                x++;
            }
            else if (x == 4) {  
                if (lastdigit != 0) {
                    temp = q.convert(lastdigit) + " thousand";
                    ans = temp + " " + ans;
                }
                n = n / 10;
                x++;
            }
            else if (x == 5) {  // Millions place
                if (lastdigit != 0) {
                    temp = q.convert(lastdigit) + " million";  // Changed to "million"
                    ans = temp + " " + ans;
                }
                n = n / 10;
                x++;
            }
            else if (x == 6) {  // Billions place
                if (lastdigit != 0) {
                    temp = q.convert(lastdigit) + " billion";  // Changed to "billion"
                    ans = temp + " " + ans;
                }
                n = n / 10;
                x++;
            }
            count--;
        }

        // Final result after processing all digits
        System.out.println("The number in words is: " + ans.trim());
    }
}




