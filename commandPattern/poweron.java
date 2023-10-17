package commandpattern;

public class poweron implements Command{

    private power execute;

    public poweron (power execute){
        this.execute = execute;

    }
    @Override
    public String execute() {
        return execute.on();
    }
}

    