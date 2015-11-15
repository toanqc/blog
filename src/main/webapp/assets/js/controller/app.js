'use strict';

var app = angular.module('blog', [ 'ui.router', 'ngAnimate', 'ngCookies', 'ngMessages' ]);

app.controller('appCtrl', function($scope, $translate) {
	$scope.changeLanguage = function(langKey) {
		$translate.use(langKey);
	};
});

app.config(function($stateProvider, $urlRouterProvider) {
	$urlRouterProvider.when('', '/');
	$urlRouterProvider.otherwise('404');

	$stateProvider.state('/', {
		url : '/',
		templateUrl : 'home.html'
	}).state('detail', {
		url : '/detail',
		templateUrl : 'detail.html'
	}).state('archive', {
		url : '/archive',
		templateUrl : 'archive.html'
	}).state('about-me', {
		url : '/about-me',
		templateUrl : 'about-me.html'
	}).state('404', {
		url : '/404',
		templateUrl : 'errors/404.html'
	});
});