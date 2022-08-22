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

import utilities.math.MathUtilities;

/**
 * A 2D Point (x, y) only.
 * 
 * Points are ordered lexicographically (thus implementing the Comparable interface)
 * 
 * @author C. Alvin
 */
public class Point implements Comparable<Point>
{
	public static final String ANONYMOUS = "__UNNAMED";

	public static final Point ORIGIN;
	static
	{
		ORIGIN = new Point("origin", 0, 0);
	}

	protected double _x;
	public double getX() { return this._x; }

	protected double _y; 
	public double getY() { return this._y; }

	protected String _name; 
	public String getName() { return _name; }

	/**
	 * Implicit points are 'generated'.
	 * @return
	 *     Lab 2: for now, all points are NOT generated.
	 */
	public boolean isGenerated() { return false; }
	
	/**
	 * Create a new Point with the specified coordinates.
	 * @param x The X coordinate
	 * @param y The Y coordinate
	 */
	public Point(double x, double y)
	{
		// TODO
	}

	/**
	 * Create a new Point with the specified coordinates.
	 * @param name -- The name of the point. (Assigned by the UI)
	 * @param x -- The X coordinate
	 * @param y -- The Y coordinate
	 */
	public Point(String name, double x, double y)
	{
		// TODO
	}

	/**
	 * This is a special version of a mutator in which we
	 * will not overwrite the name of the Point unless, it is
	 * unnamed
	 * 
	 * @param newName -- a new String to overwrite old name
	 * @return if the new name was set return true
	 */
	public boolean setName(String newName)
	{
		// TODO
	}
	
	/**
	 * @return if this point has not user-defined name associated with it
	 */
	public boolean isUnnamed()
	{
		return _name.equals(ANONYMOUS);
	}

	@Override
	public int hashCode()
	{
		return Double.valueOf(MathUtilities.removeLessEpsilon(_x)).hashCode() +
			   Double.valueOf(MathUtilities.removeLessEpsilon(_y)).hashCode();
	}

	/**
	 * @param obj -- some object
	 * @return Coordinate-based equality: x's and y's.
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;

		if (!(obj instanceof Point)) return false;

		Point that = (Point)obj;

		// TODO: FINISH
	}

	@Override
	public String toString()
	{
		if (_x == (int) _x && _y == (int) _y)
		{
			return "Point(" + _name + ")(" + _x + ", " + _y + ")";
		}
		return "Point(" + _name + ")(" + String.format("%1$.3f", _x) + ", " + String.format("%1$.3f", _y) + ")"; 
	}

	/**
	 * 
	 * @param p1 Point 1
	 * @param p2 Point 2
	 * @return Lexicographically: p1 < p2 return -1 : p1 == p2 return 0 : p1 > p2 return 1
	 *         Order of X-coordinates first; order of Y-coordinates second
	 */
	public static int LexicographicOrdering(Point p1, Point p2)
	{
		// TODO
	}

	/**
	 * 
	 * @param p1 Point 1
	 * @param p2 Point 2
	 * @return Lexicographically: p1 < p2 return -1 : p1 == p2 return 0 : p1 > p2 return 1
	 *         Order of X-coordinates first; order of Y-coordinates second
	 *         
	 *         If that == null, this > that
	 */
	@Override
	public int compareTo(Point that)
	{
		// TODO
	}
}