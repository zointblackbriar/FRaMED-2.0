package group;

import java.util.List;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.framed.iorm.ui.UIUtil;

/**
 * This class offers utility operations in the scope of the group feature module.
 * @author Kevin Kassin
 */
public class Util {
	
	/**
	 * the object to get names, id and so on for this feature
	 */
	private final Literals literals = new Literals();
		
	//Diagram
	//~~~~~~~
	/**
	 * Convenience operation to call {@link UIUtil#getDiagramForGroupingShape(Shape, Diagram, String, String, String)} 
	 * with the correct parameters.
	 */
	public Diagram getGroupDiagramForItsShape(Shape groupOrCompartmentTypeShape, Diagram diagram) {
		return UIUtil.getDiagramForGroupingShape(groupOrCompartmentTypeShape, diagram, 
				literals.SHAPE_ID_GROUP_TYPEBODY, literals.SHAPE_ID_GROUP_NAME, literals.DIAGRAM_KIND);
	}
	
	//Update
	//~~~~~~
	/**
	 * Convenience operation to call {@link UIUtil#getNameOfPictogramElement(PictogramElement, String)} with the correct parameters.
	 */
	public String getNameOfPictogramElement(PictogramElement pictogramElement) {
		return UIUtil.getNameOfPictogramElement(pictogramElement, literals.SHAPE_ID_GROUP_NAME);
	}
	
	/**
	 * Convenience operation to call {@link UIUtil#getContentPreviewElementsNames(PictogramElement, String, String)} 
	 * with the correct parameters.
	 */
	public List<String> getContentPreviewElementsNames(PictogramElement pictogramElement) {
		return UIUtil.getContentPreviewElementsNames(pictogramElement, literals.SHAPE_ID_GROUP_CONTENT_PREVIEW, literals.SHAPE_ID_GROUP_ELEMENT);
	}
}
