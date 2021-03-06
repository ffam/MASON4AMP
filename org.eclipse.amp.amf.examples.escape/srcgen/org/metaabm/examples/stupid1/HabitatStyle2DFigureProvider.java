package org.metaabm.examples.stupid1;

import org.ascape.util.vis.ColorFeature;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.ColorConstants;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.DefaultFigureProvider;
import org.eclipse.amp.agf.gef.Shapes;

/**
 * <!-- begin-user-doc -->
 * Habitat Style 2D Java Implementation.
 * 
 * Generated by AMF for model: StupidModel1.metaabm in project: org.eclipse.amp.amf.examples.escape 
 * <!-- end-user-doc -->
 * @generated
 */
public class HabitatStyle2DFigureProvider extends DefaultFigureProvider {

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static IFigureProvider singleton;

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFigure getFigure(Object object) {
		IFigure figure = null;
		Color color = null;
		Habitat rootActGroup = (Habitat) object;
		Habitat habitatRule = rootActGroup;
		if (figure == null) {
			figure = Shapes.createRectangle();
		}
		color = ColorConstants.green;

		figure.setBackgroundColor(color);
		((Shape) figure).setFill(true);
		return figure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IFigureProvider getDefault() {
		if (singleton == null) {
			singleton = new HabitatStyle2DFigureProvider();
		}
		return singleton;
	}
}
