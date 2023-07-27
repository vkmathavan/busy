package add;

public class bussiness extends employe{

    @Override
    public void GST(float amount){
        float gst = amount*0.50f;
        System.out.println(gst);
    }
}
