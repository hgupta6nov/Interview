
public class FindRangeInInputs {

    public static void main(String[] args) {

        int[] input = {1,2,3,6,7,8};
        System.out.println(convertArray(input));
    }

    static public StringBuffer convertArray(int[] input)
    {
        StringBuffer output = new StringBuffer("");

        int start = 0;

        for(int i =0; i< input.length; i++)
        {
            while(i<input.length -1 && input[i+1] - input[i] == 1)
            {
                i++;
            }
            if(start!=i)
            {
                output.append(input[start] + "-" + input[i] + ",");
            }
            else
            {
                output.append(input[i] + ",");
            }
            start = i+1;
        }

        return output;
    }


}
