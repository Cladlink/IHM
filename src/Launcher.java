/*
 * Created by cladlink on 25/03/16.
 */
public class Launcher
{
    public static void main (String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            ControlGroup controler = new ControlGroup(model);
        });
    }
}
