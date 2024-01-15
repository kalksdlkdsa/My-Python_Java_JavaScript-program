using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace DateTimeTest {
	class Program {
		static void main(string[] args) {
			DateTime latestDate = new DateTime(9999,12,31,23,59,59,999);
			Console.WriteLine(latestDate);
			DateTime earliestDate = new DateTime(0001,1,1,0,0,0,0);
			Console.WriteLine(earliestDate);
			Console.Read();
		}
	}
}