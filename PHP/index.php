<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("AW456", new Account("Andres Herrera", "AMS123"));
$car->printDataCar();

$car2 = new Car("UTF785", new Account("Cookie Dog", "LRD7452"));
$car2->printDataCar();

?>