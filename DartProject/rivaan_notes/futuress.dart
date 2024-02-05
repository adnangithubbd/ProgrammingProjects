import 'dart:async';

void main() async {
  print('Main');
  // final result = await wait();
  // print(result);
  List<int> numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  final evenNumbers = numbers.where((element) => element % 2 == 0).toList();

  evenNumbers.forEach((number) {
    print(number);
  });

  print('end of main');
}

Future<String> wait() {
  return Future.delayed(Duration(seconds: 2), () => 'Hey there');
}
