class Whatsapp1
{
         public void Status()
         {
             System.out.println("15 seconds Status");
         }

}
class Whatsapp2 extends Whatsapp1
{
    @Override
    public void Status()
    {
        System.out.println("30 seconds Status");
    }

    public void AudioCall()
    {
        System.out.println("Audio Call");
    }

}
class Whatsapp3 extends Whatsapp2
{

    public void VideoCall()
    {
        System.out.println("Video Call");
    }

    @Override
    public void Status()
    {
        System.out.println("30 seconds Status.1080p ");
    }



}

class Wdriver
{

    public static void main(String[] args)
    {
        Whatsapp1 ref = new Whatsapp3();
        Whatsapp3 r = (Whatsapp3)ref;
        r.AudioCall();
        r.VideoCall();
        r.Status();




    }


}