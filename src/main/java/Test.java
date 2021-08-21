import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
    public static void main(String[] args) {
        int[][] a=new int[7][12];
        ObjectMapper objectMapper=new ObjectMapper();
        try {
            System.out.println(objectMapper.writeValueAsString(a));
            for (int i=0;i<12;i++){
                a[0][i]=-1;
            }
            System.out.println(objectMapper.writeValueAsString(a));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
