package main.expacecat.patterns.behavioralpatterns.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Sleeping){
            setActivity(new Traning());
        } else if(activity instanceof Traning){
            setActivity(new Codding());
        } else if(activity instanceof Codding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading ) {
            setActivity(new Sleeping());
        }

    }

    public void justDoIt(){
        activity.justDoIt();
    }
}

