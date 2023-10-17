package commandpattern;

public class poweroff implements Command{

    private power execute;

    public poweroff (power execute){
        this.execute = execute;

    }
    @Override
    public String execute() {
        return execute.off();
    }
}