describe('Protractor Element Demo',function(){
	
	it('Locators',function(){
		
		browser.get('http://juliemr.github.io/protractor-demo/');
		element(by.model("first")).sendKeys("3");
		element(by.css("select[ng-model='operator']")).element(by.css("option[value='DIVISION']")).click();
		element(by.model("second")).sendKeys("5");
		element(by.id("gobutton")).click();
		
		
		})
		})
	