public class OctalObserver {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {            @Override

            System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
