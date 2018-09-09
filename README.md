Wikipedia: "Spirograph is a geometric drawing toy that produces mathematical roulette curves of the variety technically known as hypotrochoids and epitrochoids. It was developed by British engineer Denys Fisher and first sold in 1965."<br/>
We can use these equations to calculate the coordinate of each point on Spirograph:<br/>
    x(t) = (R+r)*cos((r/R)*t) - a*cos((1+r/R)*t)<br/>
    y(t) = (R+r)*sin((r/R)*t) - a*sin((1+r/R)*t)<br/>
    
I used Java to calculate all the coordinates of Spirograph and print them in the form of (longitude, latitude) pair. Then I pasted all the output into KML file (https://developers.google.com/kml/documentation/kml_tut). Then open KML in Google Earth, we can get this Spirograph! (the center of this Spirograph is our classroom:))

<img width="1280" alt="spiro" src="https://user-images.githubusercontent.com/11751622/45260554-835ecc00-b39f-11e8-8f5d-65023696bbd4.png">
