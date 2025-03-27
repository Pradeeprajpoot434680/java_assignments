import java.util.Scanner;

class Question7
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String arg[])
    {
         String paragraph = """
        In the world of discovery there are many paths that lead to
        understanding and growth each person has their own journey to embark on some people 
        seek knowledge while others seek adventure the quest for answers is an ongoing process
        that requires dedication and curiosity curiosity is a trait that drives people to explore 
        unknown territories and to uncover hidden truths exploration can take many forms from studying 
        the stars to understanding the depths of the ocean in each case the goal is to find something 
        new something that can change the way we think or the way we live science is one of the primary fields
        of exploration where researchers constantly push the boundaries of what we know scientists work tirelessly
        to answer questions that have yet to be solved their discoveries impact every aspect of life from medicine 
        to technology in addition to the scientific world there are also other forms of exploration such as the exploration 
        of history and literature these fields allow people to dive into the past and understand the experiences of those who 
        came before us history can teach us lessons that are often forgotten while literature offers insights into the human 
        condition both of these areas of study help us to see the world through a different lens and challenge our perceptions
        the importance of exploration cannot be overstated it is exploration that allows for growth it is through exploring the 
        unknown that we expand our knowledge and understanding the desire to explore is something that resides deep within
        humanity and it will continue to drive us toward new discoveries and new horizons the future of 
        exploration is bright as people continue to seek out new challenges and new frontiers to conquer""";

        String search ;
        System.out.println("Enter the word that you want to search:");
        search = sc.nextLine();
        int index = 0;
        int count =0;
        //indexOf(char ch)
        //indexOf(char ch,int fromIndex)
        //indexOf(string s);
        //indexOf(string s,int fromindex);
        //return the index otherwise -1


        while(index < paragraph.length() &&  (index = paragraph.indexOf(search, index)) != -1)
        {
           count++;
           index += search.length();
        }

        System.out.println("the word "+ search + " is present :" + count + " times");

    }
}