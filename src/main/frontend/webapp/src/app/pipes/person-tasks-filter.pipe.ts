import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'personTasksFilter'
})
export class PersonTasksFilterPipe implements PipeTransform {
  transform(tasks: any[], personName: string): any[] {
    if (!tasks || !personName) {
      return tasks;
    }

    return tasks.filter(task => task.assignee === personName);
  }
}
