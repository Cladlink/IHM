import javax.swing.*;

public class Vue extends JFrame
{
    private JLabel score;
    public Vue(Model model)
    {
        initAttribut();
        creerWidget();

        setTitle("Puzzle : 4x4");
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
    }


    public void initAttribut()
    {
        score = new JLabel("Jlabel");
    }


    public void creerWidget()
    {
        JPanel pano = new JPanel();
        pano.add(score);
        setContentPane(score);
    }
}
