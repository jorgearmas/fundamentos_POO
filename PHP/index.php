<?php

require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once('Account.php');

$uberX = new UberX('CVB123', new Account('Andres Herrera', 'AND46'), 'Chevrolet', 'Spark');
$uberX->printDataCar();

$uberPool = new UberPool('RET745', new Account('Mack Lopez', 'MCL45'), 'Honda', 'Fit');
$uberPool->printDataCar();
