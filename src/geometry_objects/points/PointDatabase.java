/**
 * Write a succinct, meaningful description of the class here. You should avoid wordiness    
 * and redundancy. If necessary, additional paragraphs should be preceded by <p>,
 * the html tag for a new paragraph.
 *
 * <p>Bugs: (a list of bugs and / or other problems)
 *
 * @author <your name>
 * @date   <date of completion>
 */

package geometry_objects.points;

import java.util.List;
import java.util.Set;

/**
 * This class represents a bi-directional database of points.
 * 
 * We can lookup a point given:
 *   (a) coordinates --> name
 *   (b) name --> coordinates
 * 
 * This is a Facade class with the Point Factory in the background
 * 
 * @author calvin
 */
public class PointDatabase
{
	// This factory is the central means of representing all
    // points in a geometry figure
    protected PointNamingFactory _factory;

    /**
     * @return the set of all points in this database.
     */
    public Set<Point> getPoints() { /* TODO */ }
    
	public PointDatabase()
	{
		// TODO
	}

	public PointDatabase(List<Point> points)
	{
		// TODO
	}

	public int size() { return _factory.size(); }
	
	/**
	 * Add this point to the database; the following algorithm is implemented by
	 * the PointNamingFactory:
	 * 
	 *   If the point with the given coordinates are not in the database, we add it (as is)
	 *   If the point is in the database:
	 *      * If the new point defines a name (and old is unnamed), we overwrite
	 *      * If the new point is unnamed, we do not overwrite
     *        the name (this is a do-nothing operation)
	 *     
	 * @param name -- name of a point
	 * @param x, y -- coordinates of the point
	 */
	public void put(String name, double x, double y)
	{
		// TODO
	}

	/**
	 * Given raw coordinates of a point, determine if it is named.
	 * 
	 * @param x,y -- doubles defining a point (x,y)
	 * @return a string corresponding to that point, if it is named.
	 */
	public String getName(double x, double y)
	{
		// TODO
	}
	public String getName(Point pt)
	{
		// TODO
	}

	/**
	 * Given the name of a point, determine the coordinates.
	 * 
	 * @param name -- a String name
	 * @return an (x,y) corresponding to name, if it has been defined.
	 */
	public Point getPoint(String name)
	{
		// TODO
	}

	/**
	 * Given a point, acquire the stored database object; facilitates
	 * singular objects and mitigates lingering copies of points.
	 * 
	 * @param pt -- a basic point
	 * @return the database entry for the point
	 */
	public Point getPoint(Point pt)
	{
		// TODO
	}

	/**
	 * Given a raw point (x, y), acquire the stored database object.
	 * 
	 * @param x,y -- doubles defining a point (x,y)
	 * @return a string corresponding to that point, if it is named.
	 */
	public Point getPoint(double x, double y)
	{
		// TODO
	}
}