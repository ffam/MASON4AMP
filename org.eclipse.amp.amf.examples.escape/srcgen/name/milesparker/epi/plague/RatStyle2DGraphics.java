package name.milesparker.epi.plague;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

import org.ascape.util.vis.DrawFeature;

/**
 * <!-- begin-user-doc -->
 * Rat Style 2D Java Implementation.
 * 
 * Generated by AMF for model: EpidemicPlague.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class RatStyle2DGraphics extends DrawFeature {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	enum Shapes {
		rectangle, oval, marker
	};

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Shapes shape = Shapes.rectangle;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void draw(Graphics g, Object object, int width, int height) {

		HostCell actionsCell = (HostCell) object;
		if (actionsCell.getOccupant() instanceof Rat) {
			Rat actions = (Rat) actionsCell.getOccupant();
			Rat ratRule = actions;
			Color colorOrange = ColorConstants.orange;

			g.setForegroundColor(colorOrange);
			g.setBackgroundColor(colorOrange);
			shape = shape.oval;
			if (shape == Shapes.oval) {
				g.drawOval(0, 0, width, height);
			} else if (shape == Shapes.marker) {
				int d = (int) (width * .25 - 1);
				int d2 = (int) (width * .5 - 1);
				g.drawOval(d, d, d2, d2);
			} else if (shape == Shapes.rectangle) {
				g.drawRectangle(0, 0, width, height);
			}
		}
	}
}