// ignore_for_file: public_member_api_docs, sort_constructors_first
void main() {
  final child = Child('name', 121);
  child.showInfo();
}

class Parent {
  String name;
  int age;
  Parent({
    required this.name,
    required this.age,
  });
  void showInfo() {
    print('name is ${name} age is ${age}');
  }
}

class Child extends Parent {
  //Child({required super.name, required super.age}):super(age: age,name: name);
  Child(String name, int age) : super(age: age, name: name);
}
