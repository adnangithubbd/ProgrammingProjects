// ignore_for_file: public_member_api_docs, sort_constructors_first
void main() {
  print('Main is called');
  var employee = Employee();
  employee._name = "John";
  print(employee.getName());
}

class Counter {
  int _count = 0;

  void increament() {
    _count++;
  }

  int get getCount => _count;
  set setCount(int n) {
    _count = n;
  }
}

class Employee {
  var _name;

  String getName() {
    return _name;
  }

  void setName(String name) {
    this._name = name;
  }
}
