function model()
{
	document.getElementById('myModal').style.display = "block";
}

function donor()
{
	document.getElementById('myModal').style.display = "none";
	document.getElementById("blood_donation").innerHTML = "<h1 class=\"display-2\">Donate Blood</h1> <a href=\"blood_donor.html\"><img class=\"icon-img\" src=\"blood.jpeg\"></a>";
	document.getElementById("eye_donation").innerHTML = "<h1 class=\"display-2\">Donate Vision</h1> <a href=\"eye_donor.html\"><img class=\"icon-img\" src=\"eye.jpeg\"></a>";	
	document.getElementById("hospital_equipment").innerHTML = "<h1 class=\"display-2\">Hospital Equipment</h1> <a href=\"hospital_donor.html\"><img class=\"icon-img\" src=\"hospital.jpeg\"></a>";
	document.getElementById("kidney_donation").innerHTML = "<h1 class=\"display-2\">Donate Kidney</h1> <a href=\"kidney_donor.html\"><img class=\"icon-img\" src=\"kidney.jpeg\"></a>";
	document.getElementById("liver_donation").innerHTML = "<h1 class=\"display-2\">Donate Liver</h1> <a href=\"liver_donor.html\"><img class=\"icon-img\" src=\"liver.jpeg\"></a>";
	document.getElementById("bone_marrow_donation").innerHTML = "<h1 class=\"display-2\">Donate Bone Marrow</h1> <a href=\"bone_donor.html\"><img class=\"icon-img\" src=\"bone.jpeg\"></a>";

}

function recepient()
{
	document.getElementById('myModal').style.display = "none";
	document.getElementById("blood_donation").innerHTML = "<h1 class=\"display-2\">Receive blood</h1> <a href=\"blood_recepient.html\"><img class=\"icon-img\" src=\"blood.jpeg\"></a>";
	document.getElementById("eye_donation").innerHTML = "<h1 class=\"display-2\">Receive Vision</h1> <a href=\"eye_recepient.html\"><img class=\"icon-img\" src=\"eye.jpeg\"></a>";	
	document.getElementById("hospital_equipment").innerHTML = "<h1 class=\"display-2\">Hospital Equipment</h1> <a href=\"hospital_recepient.html\"><img class=\"icon-img\" src=\"hospital.jpeg\"></a>";
	document.getElementById("kidney_donation").innerHTML = "<h1 class=\"display-2\">Kidney Recepient</h1> <a href=\"kidney_recepient.html\"><img class=\"icon-img\" src=\"kidney.jpeg\"></a>";
	document.getElementById("liver_donation").innerHTML = "<h1 class=\"display-2\">Liver Recepient</h1> <a href=\"liver_recepient.html\"><img class=\"icon-img\" src=\"liver.jpeg\"></a>";
	document.getElementById("bone_marrow_donation").innerHTML = "<h1 class=\"display-2\">Bone Marrow Recepient</h1> <a href=\"bone_recepient.html\"><img class=\"icon-img\" src=\"bone.jpeg\"></a>";
}
