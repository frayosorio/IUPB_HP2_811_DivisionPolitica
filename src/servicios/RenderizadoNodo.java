package servicios;

import javax.swing.*;
import javax.swing.tree.*;

import modelos.Ciudad;

import java.awt.*;

public class RenderizadoNodo extends DefaultTreeCellRenderer {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected,
            boolean expanded, boolean leaf, int row, boolean hasFocus) {

        var c = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);

        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) value;
        Object objetoNodo = nodo.getUserObject();

        // valores predeterminados
        setForeground(Color.BLACK);
         setBackgroundNonSelectionColor(Color.WHITE);
        setFont(tree.getFont());

        if (objetoNodo instanceof Ciudad ciudad) {
            if (ciudad.isCapitalRegion()) {
                setForeground(Color.ORANGE);
                 setBackgroundNonSelectionColor(Color.BLACK);
                setFont(tree.getFont().deriveFont(Font.BOLD));
            }
            if (ciudad.isCapitalPais()) {
                setForeground(Color.cyan);
                setBackgroundNonSelectionColor(Color.BLACK);
                setFont(tree.getFont().deriveFont(Font.BOLD));
            }
        }

        return c;

    }
}
