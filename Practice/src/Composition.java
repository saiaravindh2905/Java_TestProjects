class Fish
{
    private String fname;

    Fish(String fname)
    {
      this.fname=fname;
    }

    public String getFname()
    {
        return fname;
    }

}

class Water
{
       private Fish fish;
       private String type;

      private Water(String type,String n)
       {
           this.type = type;
           this.fish=new Fish(n);
       }

    public String getType() {
        return type;
    }

    public String getFishname()
    {
       return fish.getFname();
    }

    public static Water getWater(String type,String fname)
    {
        return new Water(type,fname);
    }


}




class Composition
{
    public static void main(String[] args)
    {
        Water w = Water.getWater("Fresh Water","Fishy");

        System.out.println(w.getFishname());
        System.out.println(w.getType());


    }



}
