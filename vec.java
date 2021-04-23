
public class vec {

	double x;
	double y;
	double z;
	
  //vec constructor
	public vec(double x,double y,double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
  //returns the vector in string readable form
	public String toString() {
		return String.format("<%.3f,%.3f,%.3f>", x,y,z);	
	}
	
	//subtract two vectors
	public static vec sub(vec a,vec b) {
		return new vec(a.x-b.x,a.y-b.y,a.z-b.z);
	}
	//or
	public vec sub(vec a) {
		return new vec(a.x-this.x,a.y-this.y,a.z-this.z);
	}
	
	//add two vectors
	public static vec add(vec a,vec b) {
		return new vec(a.x+b.x,a.y+b.y,a.z+b.z);
	}
	//or
	public vec add(vec a) {
		return new vec(a.x+this.x,a.y+this.y,a.z+this.z);
	}
	
	//divide a vector by a double
	public static vec div(vec a,double b) {
		return new vec(a.x/b,a.y/b,a.z/b);
	}
	//or
	public vec div(double a) {
		return new vec(this.x/a,this.y/a,this.z/a);
	}
	
	//divide a vector by a double
	public static vec mult(vec a,double b) {
		return new vec(a.x*b,a.y*b,a.z*b);
	}
	//or
	public vec mult(double a) {
		return new vec(this.x*a,this.y*a,this.z*a);
	}
	
	//divide a vector by a integer
	public static vec div(vec a,int b) {
		return new vec(a.x/b,a.y/b,a.z/b);
	}
	//or
	public vec div(int a) {
		return new vec(this.x/a,this.y/a,this.z/a);
	}
		
	//divide a vector by a integer
	public static vec mult(vec a,int b) {
		return new vec(a.x*b,a.y*b,a.z*b);
	}
	//or
	public vec mult(int a) {
		return new vec(this.x*a,this.y*a,this.z*a);
	}
	
	//get magnitude of a vector
	public static double mag(vec a) {
		return Math.sqrt(a.x*a.x+a.y*a.y+a.z*a.z);
	}
	//or
	public double mag() {
		return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
	}
	
	//dot product of two vectors
	public static double dot(vec a, vec b) {
		return a.x*b.x+a.y*b.y+a.z*b.z;
	}
	//or
	public double dot(vec a) {
		return a.x*this.x+a.y*this.y+a.z*this.z;
	}
	
	//cross product of two vectors
	public static vec cross(vec a, vec b) {
		return new vec(a.y*b.z-a.z*b.y,a.z*b.x-a.x*b.z,a.x*b.y-a.y*b.x);
	}
	//or
	public vec cross(vec a) {
		return new vec(this.y*a.z-this.z*a.y,this.z*a.x-this.x*a.z,this.x*a.y-this.y*a.x);
	}
	
	//normal vector in the direction of a
	public static vec dir(vec a) {
		return vec.div(a,vec.mag(a));
	}
	//or
	public vec dir() {
		return vec.div(this,vec.mag(this));
	}
	
	//returns if two vectors are equal
	public static boolean equals(vec a, vec b) {
		if(a.x==b.x) {
			if(a.y==b.y) {
				if(a.z==b.z) {
					return true;
				}
			}
		}
		return false;
	}
	//or
	public boolean equal(vec a) {
		if(a.x==this.x) {
			if(a.y==this.y) {
				if(a.z==this.z) {
					return true;
				}
			}
		}
		return false;
	}
	
	//scalar projection of a onto b
	public static double comp(vec a,vec b) {
		return a.dot(b.dir());
	}
	//or
	public double comp(vec a) {
		return this.dot(a.dir());
	}
	
	//vector projection of a onto b
	public static vec proj(vec a,vec b) {
		return b.mult(a.dot(b.dir()));
	}
	//or
	public vec proj(vec a) {
		return a.mult(this.dot(a.dir()));
	}
	
	//creates a random vector with components between -1,1 inclusive
	public static vec random(){
		return new vec(Math.random()*(2+Double.MIN_VALUE)-1
				,Math.random()*(2+Double.MIN_VALUE)-1
				,Math.random()*(2+Double.MIN_VALUE)-1);
	}
	//creates a random vector with components between -a,a inclusive
	public static vec random(double a){
		return new vec(Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*a+Double.MIN_VALUE)-a);
	}
	//or
	public static vec random(int a){
		return new vec(Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*a+Double.MIN_VALUE)-a);
	}
	//creates a random vector with components <[-a,a],[-b,b],[-c,c]>
	public static vec random(double a, double b, double c){
		return new vec(Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*b+Double.MIN_VALUE)-b
				,Math.random()*(2*c+Double.MIN_VALUE)-c);
	}
	//or
	public static vec random(int a,int b,int c){
		return new vec(Math.random()*(2*a+Double.MIN_VALUE)-a
				,Math.random()*(2*b+Double.MIN_VALUE)-b
				,Math.random()*(2*c+Double.MIN_VALUE)-c);
	}
	
	//returns angle between two vectors
	public static double diff(vec a, vec b) {
		return Math.acos(a.dot(b)/(a.mag()*b.mag()));
	}
	//or
	public double diff(vec a) {
		return Math.acos(this.dot(a)/(this.mag()*a.mag()));
	}
}
