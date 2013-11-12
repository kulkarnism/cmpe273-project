<#include "./header.ftl"> 
<#if container??>
  <div ="${container}">
<#else>
  <div ="default">
</#if>
<form>
<br/>
<#if universityObject?has_content>
<div id="map_div"></div>
<h1><div align="center">Details of University</div></h1>
<div ="input page">
<div align="center">
 <table class="datatable" border="2" cellpadding="5">
 <#list universityObject as universityObject>
    <tr>
        <th rowspan ="2">School Name</th>  
        <th rowspan ="2">Tution Fees</th>
        <th rowspan="2">Location</th>
        <th rowspan = "2">Contact</th>
<th colspan="2">Application Date</th>
    </tr>
    <tr>
     <td bgcolor="yellow"><b>Spring Term</td>
     <td bgcolor="yellow"><b>Fall Term</td>     
    </tr> 
    <tr>
     <td id='univName'>${universityObject.getSchoolName()}</td>
     <td id='fees'>${universityObject.getTuitionFees()}</td>
     <td id='location'>${universityObject.getLocation()}</td>
      <td id='contact'>${universityObject.getContact()}</td>
      <td>${universityObject.getSpringApplnDate()}</td>
      <td>${universityObject.getFallApplnDate()}</td>
    </tr>   
  </table>
</div>
</br>
</br>
<div align="center">
<table class="datatable" border="2" cellpadding="5">
  <tr>
  		<th>Department</th>  
        <th>GRE Score</th>
        <th>TOEFL Score</th>
        <th>IELTS Score</th>
   </tr>
   
   <tr>
   		<td>${universityObject.getDepartment()}</td>
   		<td>${universityObject.getGreScore()}</td>
   		<td>${universityObject.getToeflScore()}</td>
   		<td>${universityObject.getIeltsScore()}</td>
   </tr>
 </#list>
</table>
</div>
<#else>
<h1><div align ="center"><font size=15>
<img src="http://i41.tinypic.com/v5dao7.png"/></div></h1></font>
<h3><div align ="center">Your one stop destination for university search</div></h3>
<h3><div align ="center">Enter the name or part of the name of the university you are looking for</div></h3>
<div align="center"><input type="text" name="searchText" /> <br/><br/>
<input type="submit" value="submit" name="submit" /></div>

</#if>
</form>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
<script>
 google.load('visualization', '1', {'packages': ['geomap']});
      google.setOnLoadCallback(drawMap);
function drawMap() {
var contact=document.getElementById('contact').textContent;
var location=document.getElementById('location').textContent;
var university=document.getElementById('univName').textContent;
      	var data = google.visualization.arrayToDataTable([
        ['Location','tuition fees','univName'],
        [contact,7500,university]       
      ]);

      var options = {};
      options['region'] = 'US';
      options['colors'] = [0xFF8747, 0xFFB581, 0xc06000]; //orange colors
      options['dataMode'] = 'markers';

      var container = document.getElementById('map_div');
      var geomap = new google.visualization.GeoMap(container);
      geomap.draw(data, options);
    };
   </script>
<#include "./footer.ftl"> 








