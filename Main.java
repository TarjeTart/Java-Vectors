
public class Main {

	public static void main(String[] args) {

		//creates 3 random vectors, default range [-1,1] or input own range with int or double value
		vec testVec1 = vec.random();
		vec testVec2 = vec.random(10);
		vec testVec3 = vec.random(10.5);
		
		//use toString() to print vectors. toString(prec) will set decimal precision to prec decimal points, max precision 6
		System.out.printf("vec 1: %s\nvec 2: %s\nvec 3: %s\n",testVec1.toString(),testVec2.toString(0),testVec3.toString(7));

		//vectors can be user defined
		testVec1 = new vec(1,1.5,5);
		//the range for x,y, and z in random can be set as well
		testVec2 = vec.random(5, 50, 500);
		
		//components of vectors are returned as doubles
		System.out.printf("vec 1 x-value: %.1f\n",testVec1.y);
		
		//vectors the sub and add functions return a new vec with the components of each vector added or subtracted
		System.out.printf("%s + %s = %s\n%s - %s = %s\n"
				//add and sub can be called statically
				,testVec1.toString(),testVec2.toString(),vec.add(testVec1, testVec2).toString()
				//or called on the vector
				,testVec1.toString(),testVec2.toString(),testVec1.sub(testVec2).toString());
		
		//vectors can be multiplied or divided by integers and doubles
		System.out.printf("%s / %s = %s\n%s * %s = %s\n"
				//mult and div can be called statically
				,testVec1.toString(),5,vec.div(testVec1, 5).toString()
				//or called on the vector
				,testVec2.toString(),2.0,testVec2.mult(2.0).toString());
		
		//use vec.mag(vector) or vector.mag() to get a vectors magnitude
		System.out.printf("Magnitude of %s = %s\nMagnitude of %s = %s\n"
				,testVec1.toString(),vec.mag(testVec1)
				,testVec2.toString(),testVec2.mag());
		
		//dot and cross can also be calculated using same logic as previous methods
		System.out.printf("%s . %s = %s\n%s x %s = %s\n"
				//mult and div can be called statically
				,testVec1.toString(),testVec2.toString(),vec.dot(testVec1, testVec2)
				//or called on the vector
				,testVec1.toString(),testVec2.toString(),testVec1.cross(testVec2).toString());
		
		//static and non-static methods are also available for dir(hat vector), scalar/vector projections
		//,and diff(angle between two vectors)
		System.out.println("vec 1 hat: " + testVec1.dir().toString());
		System.out.println("vec 1 (vector)projected onto vec 2: " + testVec1.proj(testVec2).toString());
		System.out.println("vec 1 (scalar)projected onto vec 2: " + testVec1.comp(testVec2));
		System.out.println("angle between vec 1 and vec 2: " + testVec1.diff(testVec2));
		
		//finally, vectors can be equated using equals (statically or directly)
		testVec3 = new vec(1,1.5,5);
		System.out.println(testVec3.toString());
		System.out.println("vec 1 = vec 2: " + vec.equals(testVec1, testVec2));
		System.out.println("vec 1 = vec 3: " + testVec1.equals(testVec3));
		
	}

}
