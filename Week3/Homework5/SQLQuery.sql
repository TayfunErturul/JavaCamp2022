--SELECT
--ANSII
SELECT ContactName Adi,CompanyName SirketAdi,City Sehir FROM [Customers]

Select * From Customers where City='Berlin'

--case insensitive
Select * From Products where CategoryId=1 or CategoryId=3

Select * From Products where CategoryId=1 and UnitPrice>=10

Select * From Products order by UnitPrice desc		--ascending		--descending

Select * From Products where CategoryID=1 order by UnitPrice desc	

Select Count(*) From Products

Select Count(*) Adet From Products where CategoryID=3

Select CategoryID, Count(*) Adet From Products Group by CategoryID

Select CategoryID, Count(*) Adet From Products Group by CategoryID having Count(*)<10

Select CategoryID, Count(*) Adet From Products where UnitPrice>20 Group by CategoryID having Count(*)<10

----JOIN----
--INNER JOIN --> Sadece iki tablodada "eşleşen" dataları getirir.
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID

--DTO(Data Transformation Object)
Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName from Products inner join Categories on Products.CategoryID = Categories.CategoryID where Products.UnitPrice>10

Select * From Products p inner join [Order Details] od on p.ProductID=od.ProductID

--LEFT JOIN --> Yazıma göre soldaki tabloda olup sağdaki tabloda olmayan datalarıda getirir. Aşağıdaki yazılıma göre konuşacak olursak Products left joinin solunda olan tablo olduğu için
--Product tablosunda olup Order Details tablosunda kaydı olan ve olmayan kayıtlarıda getirir. 
Select * From Products p left join [Order Details] od on p.ProductID=od.ProductID

Select * From Customers c left join Orders o on c.CustomerID=o.CustomerID 

--Customer tablosunda kaydı olan ancak hiç siparişi olmayan müşterileri getirmek için
Select * From Customers c left join Orders o on c.CustomerID=o.CustomerID where o.CustomerID is null

--RIGHT JOIN(LEFT JOININ TAM TERSI) - Sağ tabloda kaydı varsa sol tabloda kaydı olsada olmasada getirir.

--BIRDEN FAZLA JOIN KULLANMA ISLEMI
Select * From Products p 
inner join [Order Details] od on p.ProductID=od.ProductID 
inner join Orders o on o.OrderId=od.OrderId
